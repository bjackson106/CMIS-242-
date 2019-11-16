package umuc.bacchusjackson;

import java.util.HashMap;

public class IPGuardNonGen {

  HashMap userTable = new HashMap();

  public IPGuardNonGen() {
    // Non Generic Example

    userTable.put("192.168.1.1", "Admin");
    userTable.put("192.168.1.2", "Admin");
    userTable.put("192.168.1.3", "User");
    userTable.put("192.168.1.4", "User");
    userTable.put(5, "User");

  }

  public void checkUser(Object testCase) {
    System.out.println("Number of Users: " + userTable.size());

    System.out.println("Checking " + testCase);
    if(userTable.containsKey(testCase)) {
      System.out.println("This address is authorized and has " + userTable.get(testCase) + " level permissions");
    } else {
      System.out.println("This address is not authorized");
    }
  }

}
