/*
Java annotation can be used to define the metadata of a Java class or class element. We can use Java annotation at the compile time to instruct the compiler about the build process. Annotation is also used at runtime to get insight into the properties of class elements.

Java annotation can be added to an element in the following way:

@Entity
Class DemoClass{

}
We can also set a value to the annotation member. For example:

@Entity(EntityName="DemoClass")
Class DemoClass{

}
In Java, there are several built-in annotations. You can also define your own annotations in the following way:

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
   String userRole() default "GUEST";
}
*/
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
	String userRole() default "GUEST";
	int budgetLimit();
}

class FamilyMember {
	@FamilyBudget(userRole="SENIOR",budgetLimit=100)
	public void seniorMember(int budget, int moneySpend) {
		System.out.println("Senior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}

	@FamilyBudget(userRole="JUNIOR",budgetLimit=50)
	public void juniorUser(int budget, int moneySpend) {
		System.out.println("Junior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String role = in.next();
			int spend = in.nextInt();
			try {
				Class annotatedClass = FamilyMember.class;
				Method[] methods = annotatedClass.getMethods();
				for (Method method : methods) {
					if (method.isAnnotationPresent(FamilyBudget.class)) {
						FamilyBudget family = method
								.getAnnotation(FamilyBudget.class);
						String userRole = family.userRole();
						int budgetLimit =family.budgetLimit();
						if (userRole.equals(role)) {
							if(spend<=budgetLimit){
								method.invoke(FamilyMember.class.newInstance(),
										budgetLimit, spend);
							}else{
								System.out.println("Budget Limit Over");
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			testCases--;
		}
	}
}
