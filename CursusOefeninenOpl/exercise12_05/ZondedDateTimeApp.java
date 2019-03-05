package be.intecbrussel.basis.exercise12_05;

import java.time.*;

public class ZondedDateTimeApp {

    public static void main (String[] args) {


        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId adelaideZone = ZoneId.of("Australia/Adelaide");
        ZoneId otherZone = ZoneOffset.ofHours(-4);

        ZonedDateTime nowHere = ZonedDateTime.now();
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);
        ZonedDateTime nowAdelaide = ZonedDateTime.now(adelaideZone);
        ZonedDateTime nowOther = ZonedDateTime.now(otherZone);

        System.out.println(nowHere);
        System.out.println(nowLondon);
        System.out.println(nowSydney);
        System.out.println(nowAdelaide);
        System.out.println(nowOther);


    }
}
