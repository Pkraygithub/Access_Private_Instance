package user.data;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {

		// User user= new User();

		Class<?> clz = Class.forName("user.data.User"); // By Using Reflection Api We can Access Private Variable by outside of class
		Field age = clz.getDeclaredField("age");
		Field name = clz.getDeclaredField("name");
		name.setAccessible(true);
		age.setAccessible(true);

		Object obj = clz.newInstance();
		User user = (User) obj;
		name.set(user, "Pankaj Kumar");
		age.set(user, 30);
		user.getUserAge();
	}

}
