package collection;

import java.util.*;

public class CollectionInJava {
    public static void main(String[] args) {
            HashMaps obj = new HashMaps();
            obj.lists();
            obj.hashMap();
        }
    }
    class Lists{

        // for ArrayList &  linkedList & vector
        void lists() {
            ArrayList<String> names = new ArrayList<>();  //type safe methode for List object creation
            names.add("Ashish");
            names.add("Ravi");
            names.add("Vimla");
            names.add("Raj");
            System.out.println(names);
//names.clear();

            // by using foreach  loop   and reverse Strnig
            for(String str: names){
                System.out.print(str+"\t"+str.length()+"\t");
                StringBuffer br=new StringBuffer(str);
                System.out.println(br.reverse());
            }

        /* forloop
for(int i=1;i<=names.size(); i++){
    System.out.println(names.get(i));
}
*/
            //for element check
            System.out.println(names.contains("Ashish"));


            // add any indexes any string
            names.add(1, "Rajeev");
            System.out.println(names);

            // get paticular element
            System.out.println(names.get(2));

            // for replacing any element
            System.out.println(names.set(1, "Raju"));

            //remove particular element
            names.remove(1);
            System.out.println(names);

// checking list is empty or not
            System.out.println(names.isEmpty());

         /*   System.out.println("using linkedlist------->>>>>>");
            LinkedList li=new LinkedList();
            li.addAll(names);
            li.add(123);
            li.add(12.99);
            li.add(true);
            System.out.println(li);*/
            System.out.println("Using vecter ----->>>");
            Vector<String> vecter=new Vector<>();
            vecter.addAll(names);
            vecter.add("Ashish kumar");
            System.out.println(vecter);

            System.out.println("Using hashSet------->>>>");
            HashSet<String> hashset=new HashSet<>();
            hashset.addAll(names);
            hashset.add("Sarvesh");
            System.out.println(hashset);

            System.out.println("Here the sorted Array------->>>>>");
            TreeSet<String> tree=new TreeSet<>();
            tree.addAll(names);
            tree.add("Riya");
            System.out.println(tree);


            System.out.println("for Iterrator===========>>>>>>>>");

            Iterator<String> itr= names.iterator();
            while(itr.hasNext())
            {
                String next= itr.next();
                System.out.println(next);
            }
            System.out.println("Using  forEach method  & lambda methode============>>>>>>>> ");
            names.forEach(str->{

                System.out.println(str);


            });


        }

    }


    class HashMaps extends Lists {
        void hashMap() {
            HashMap<String, Integer> courses = new HashMap<>();
            System.out.println("course and its fees");
            courses.put("Core", 4000);
            courses.put("HTML", 2000);
            courses.put("c Language", 2000);
            courses.put("Spring boot", 7000);

            System.out.println(courses);

            courses.forEach((str1, str2) -> {
                System.out.print(str1);
                System.out.print(" fees is ");
                System.out.println(str2);
            });

        }


    }

