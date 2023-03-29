package Object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class EqualsOverriding {

    private String name;

    public EqualsOverriding(String name) {
        this.name = name;
    }

    //equals() 함수를 재정의
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;

        if(o == null | getClass() != o.getClass()) return false;

        EqualsOverriding eo = (EqualsOverriding) o;

        return Objects.equals(o, eo);
    }

    public static void main(String[] args) {

        EqualsOverriding eo = new EqualsOverriding("100");
        EqualsOverriding eo1 = new EqualsOverriding("100");

        System.out.println(eo.equals(eo1));
        //JVM은 equals()가 true값을 반환하면 hashcode를 통해 나오는 값도 동일하여야 한다.
        //equals()만 재정의를 하니 equals()는 true를 반환하지만 두 hash값은 다르게 나온다.
        System.out.println(eo.hashCode());
        System.out.println(eo1.hashCode());


        //ArrayList
        List<EqualsOverriding> eoList = new ArrayList<>();

        eoList.add(new EqualsOverriding("200"));
        eoList.add(new EqualsOverriding("200"));

        System.out.println("ArrayList의 크기 : " + eoList.size());

        //HashSet
        Set<EqualsOverriding> eoSet = new HashSet<>();

        eoSet.add(new EqualsOverriding("300"));
        eoSet.add(new EqualsOverriding("300"));

        System.out.println("HashSet의 크기 : " + eoSet.size());
        //HashSet은 중복을 허용하지 않는다고 하였는데 똑같은 300을 넣었는데도 크기가 2로 확인된다.
        //두 객체의 hashcode 값이 달라 다른 객체라고 판단하였기 때문이다.

    }


}