package com.myleetcode;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ParkingLot
{

    private static SimpleDateFormat SDF = new SimpleDateFormat("HH:mm");

    public ParkingLot()
    {

    }

    public int solution(String E, String L) throws Exception
    {

       int totalCost = 2;

       int totalTime =  getTotalMinutes(E,L);

       if(totalTime == 0)
       {
          return 0;
       }
       int remainingTime = totalTime;

       // first full hour or partial hour costs 3
       totalCost += 3;
       remainingTime = totalTime-60;

       if(remainingTime < 0)
       {
          return totalCost;
       }

       int remainingHours = remainingTime/60;
       int remaningMin = remainingTime%60;

       totalCost += 4*remainingHours;
      
       if(remaningMin > 0)
       {
          totalCost += 4;
       }

       return totalCost;

    }

    public int getTotalMinutes(String E, String L) throws Exception
    {
       Date date1 = SDF.parse(E);
       Date date2 = SDF.parse(L);
       return date2.getMinutes()-date1.getMinutes();
    }

    public static void main(String[] args)
    {
      try{
         System.out.println(new ParkingLot().solution("10:00", "13:21"));
      }catch(Exception e){
         e.printStackTrace();
      }
    }

}
