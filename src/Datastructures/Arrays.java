package Datastructures;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class Arrays {
    public static void main(String[] args){
        String[] alphabet ={"a","b","c","d","e","f","g"};
        System.out.println("The old fashioned way");
        for (int i = 0; i < 5 ;i++){
            System.out.print(alphabet[i] + " ");
        }
        System.out.println("\n\nUsing the length variable");
        for (int n =0; n < alphabet.length;n++){
          System.out.print(alphabet[n] + " ");
        }
        System.out.println("\n\nUsing the for-each method");
        for (String letter : alphabet){
            System.out.print(letter + " ");
        }

        System.out.println("\n\n Double Arrays");
        /*ArrayList<ArrayList<String>> users = new ArrayList<ArrayList<String>>();
        ArrayList<String> user = new ArrayList<String>();
        user.add("John");
        user.add("Williams");
        user.add("jw@gmail.com");
        users.add(user);*/
        String[][] users = {
                {"John","Williams","jw@gmail.com","64283923"},
                {"Sara","Jason","sj@gmail.com","32743298"},
                {"Rachel","wallace","rw@gmail.com","479489654"}

        };
       int numOfUsers = users.length;
       int numOfFields = users[0].length;
       System.out.println("Number of user:" + numOfUsers);
        System.out.println("Number of fields:" + numOfFields);

        for(int i = 0; i < numOfUsers; i++){
            for (int j = 0; j < numOfFields; j++){
                System.out.println(users[i][j]);
            }

        for(int k = 0; k < numOfUsers; k++) {
            String firstName = users[k][0];
            String lastName = users[k][1];
            String email = users[k][2];
            String phone = users[k][3];
            System.out.println(firstName + " " + lastName + " " + email + " " + phone);
        }

            }

        System.out.println("\n\n Using FOR EACH");
        for(String[] user :users){
            System.out.print("[");
            for (String field : user)
            {
                System.out.print(field + "");
            }
        }
        System.out.print("]");
    }
}
