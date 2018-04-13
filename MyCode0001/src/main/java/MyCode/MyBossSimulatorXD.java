package MyCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyBossSimulatorXD {
    public static void main(String[] args){
    MyBossSimulatorXD bs = new MyBossSimulatorXD();
    MyInterface intrTriple;
    HashMap<String, Integer> hm1 = new HashMap<>();

        hm1.put("Тини монтепульчано",3 );
        hm1.put("Тини треббьяно",3 );
        hm1.put("Фетцер зенфандель",1 );
        hm1.put("Фрескелло розе",3 );
        hm1.put("Терре аллегре Санжовезе",2 );
        hm1.put("Российское шампанское сухое",5 );
        hm1.put("Российское шампанское полусладкое",4 );
        hm1.put("Тайга",150 );
        hm1.put("Абсолют",3 );
        hm1.put("Вальполичелло",3 );

        bs.printMap(hm1);
        System.out.println("Сумма остатков = "+bs.getSumOfValues(hm1));
        System.out.println(bs.SayResult(bs.getSumOfValues(hm1)));
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
}
