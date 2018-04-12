package MyCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main{
    public static void main(String[] args) throws OneParametrIsNullExeption {
        Main mn = new Main();
        MyInterface intrTriple;
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("Тини монтепульчано",3 );
        hm1.put("Тини треббьяно",3 );
        hm1.put("Фетцер зенфандель",1 );
        hm1.put("Фрескелло розе",3 );
        hm1.put("Терре аллегре Санжовезе",2 );
        hm1.put("Российское шампанское сухое",5 );
        hm1.put("Российское шампанское полусладкое",4 );
        hm1.put("Алтай", -100 );
        hm1.put("Тайга",12 );
        hm1.put("Абсолют",3 );
        hm1.put("Вальполичелло",3 );
        mn.printMap(hm1);
        System.out.println("Сумма остатков = "+mn.getSumOfValues(hm1));
        System.out.println(mn.SayResult(mn.getSumOfValues(hm1)));
    }
    public void printMap(HashMap<String,Integer> hm){
        Set<Map.Entry<String,Integer>> set = hm.entrySet();
        for (Map.Entry<String,Integer> o : set){
            System.out.print(o.getKey() + " -");
            System.out.println(o.getValue() + "");
        }
        System.out.println("---------------------------------------------------");
    }
    public int getSumOfValues(HashMap<String,Integer> hm1){
        Set<Map.Entry<String,Integer>> set = hm1.entrySet();
        int sumOfValue =0;
        for(Map.Entry<String,Integer> o : set){
            sumOfValue += o.getValue();
        }
        return sumOfValue;
    }
    public String SayResult(int sum){
        if (sum >= 50)
            return "Нахера ты столько заказал ?";
        else if (sum <50 && sum > 15)
            return "Ты уверен что тебе хватит ?";
        else
            return "ты опять за компом сидишь? иди работай";
    }
//MyInterface intrTestSomethingHarder;
//int[] arr6 = {5,6,7,8,9};
//int[][] arr8 = new int[2][8];
//int[][] arr7 = {{4,6,7,8,9},{6,5,46,47,6}};
//        ArrayList<String> ar1 = new ArrayList<String>();
//        ar1.add("WTF?");
//        ar1.add("is");
//        ar1.add("going");
//        ar1.add("on");
//        ar1.add("d54d34d32d21d10d");
//        System.out.println(ar1.size());
//        ar1.remove(4);
//        System.out.println(ar1.size());
//        mn.printCollection(ar1);
//        ar1.clear();
//        ar1.add("work");
//        ar1.add("hard");
//        ar1.add(1,"is");
//        mn.printCollection(ar1);
//        System.out.println(ar1.get(1));
//        for (int i = 0; i<ar1.size(); i++)
//            System.out.println(ar1.get(i));
//int c =10;
//int d =25;
//int e = 100;
//intrTriple = (y,x,z) ->  {
//    double sum = y + x + z;
//    double average = sum / 3;
//    return average;
//        };
// intrTestSomethingHarder = (y,x,z) -> {
//    if (z==0) throw new OneParametrIsNullExeption();
//    int something = y * x % z;
//    return something *= something;
//};
//        System.out.println(intrTriple.myFunc(c,d,e)+"\n"
//        + intrTriple.myFunc(140, d,25));
//        System.out.println("---------------------------------------");
//        System.out.println(intrTestSomethingHarder.myFunc(c,d,e));
//        System.out.println(intrTestSomethingHarder.myFunc(c,d,e));
//        System.out.println(intrTestSomethingHarder.myFunc(c,d,e)+
////        System.out.print(intrTestSomethingHarder.myFunc(250,2,110));
//    }
//    public void printStr(String[] str){
//        for (int i = 0;i<str.length; i++)
//            System.out.println(str[i]);
//    }
//    public void printCollection(ArrayList<String> ar){
//        String[] b = new String[ar.size()];
//        ar.toArray(b);
//        for (int i =0; i < b.length; i++)
//            System.out.println(b[i]);
//        System.out.println("Конец метода printCollection");
//    }
}
