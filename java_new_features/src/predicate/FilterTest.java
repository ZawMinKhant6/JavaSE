package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fix list
		List<User> userList = Arrays.asList(
			
				new User(1001L,"MgMg","user"),
				new User(1002L,"ZawZaw","admin"),
				new User(1003L,"KyawKyaw","admin"),
				new User(1004L,"Masapal","user"),
				new User(1005L,"AungAung","user"),
				new User(1006L,"AyeAye","user"),
				new User(1007L,"TunTun","user")
		);
		
		
		List<User> adminList=filterByRole(userList, (ur) -> ur.getRole().equals("admin"));
		
		
		Consumer<User> printAdmins = ur -> System.out.println(ur);
		adminList.forEach(printAdmins);
		
//		Consumer<User> printUsers = ur -> System.out.println(ur);
//		userList.forEach(printUsers);
	}

			
	static List<User> filterByRole(List<User> userList, Predicate<User> filter){
		
			List<User> filterList = new ArrayList<User>();
			
			userList.forEach((ur) -> {
				if(filter.test(ur)) {
					filterList.add(ur);
				}
			});
			
			return filterList;
	}
	
	

}
