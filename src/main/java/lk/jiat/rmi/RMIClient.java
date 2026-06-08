package lk.jiat.rmi;

import lk.jiat.rmi.client.Message;
import lk.jiat.rmi.client.UserService;
import lk.jiat.rmi.model.Data;
import lk.jiat.rmi.model.User;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Properties;

public class RMIClient {
    public static void main(String[] args) {
        try {
//            Registry registry = LocateRegistry.getRegistry("localhost", 6666);
//            String[] list = registry.list();
//            for (String s : list) {
//                System.out.println(s);
//            }

//           UserService userService = (UserService) Naming.lookup("//127.0.0.1:6666/user_service");

//            Properties prop = new Properties();
//            prop.put(Context.PROVIDER_URL,"rmi://127.0.0.1:6666");
//            prop.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");
//
//            InitialContext ic = new InitialContext(prop);
//            UserService userService = (UserService) ic.lookup("user_service");



//            Message message = (Message) registry.lookup("message_service");
//            Data data = message.getData();

//            String m = message.hello();
//            System.out.println(m);

//            UserService userService = (UserService) registry.lookup("user_service");
//            userService.addUser(1,new User(1,"Chanuka Rukshan","Kalutara","chanukarukshan@gmail.com"));
//            userService.getAllUsers().forEach(user -> {
//                System.out.println(user.getName());
//            });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
