package com.myleetcode.interviewprep.multithread;


public class TrafficLight
{

    private Object lock;
    private boolean isRoadA;

    public TrafficLight()
    {
       lock = new Object();
       isRoadA = true;
    }

    public void carArrived(int carId,
                           int roadId,
                           int direction,
                           Runnable turnGreen,
                           Runnable crossCar)
    {

        synchronized(lock)
        {
           System.out.println();
           // roadId = 1 --> A, 2 --> B
           if(roadId == 1) // road A
           {
              System.out.print(" Road A: car: " + carId + ", direction " + direction);
              if(!isRoadA)
              {
                turnGreen.run();
                isRoadA = true;
              }
              else
              {
                 System.out.print(" Already green");
              }
           }else     // roadB
           {
              System.out.print(" Road B: car: " + carId + ", direction " + direction);
              if(isRoadA)
              {
                 turnGreen.run();
                 isRoadA = false;
              }else
              {
                System.out.print(" Already green");
              }
           }
           crossCar.run();
        }

    }

    /*public static void main(String[] args)
    {
        System.out.println("Hello Traffic Light");

        int[] cars = {1,3,5,2,4};
        int[] directions = {2,1,2,4,3};
        int[] roadIds = {1,1,1,2,2};

        TrafficLight trafficLight = new TrafficLight();

        Thread[] threads = new Thread[cars.length];

        for(int i = 0; i < cars.length; i++)
        {
           Runnable turnGreen = () -> System.out.print(" Turning to green");
           Runnable carCross  = () -> System.out.print(" Crossing Car");

           final int carId = cars[i];
           final int roadId = roadIds[i];
           final int direction = directions[i];

           threads[i] = new Thread(() -> trafficLight.carArrived(carId,
                                                                roadId,
                                                               direction,
                                                               turnGreen,
                                                               carCross));

           threads[i].start();

        }

        for(Thread t:threads)
        {
           try
           {
             t.join();
           }catch(InterruptedException e)
           {
              e.printStackTrace();
           }
        }
    }*/

    /*public static void main(String[] args)
    {
        System.out.println("Hello Traffic Light");

        int[] cars = {1,2,3,4,5};
        int[] directions = {2,4,3,3,1};
        int[] roadIds = {1,2,2,2,1};

        TrafficLight trafficLight = new TrafficLight();

        Thread[] threads = new Thread[cars.length];

        for(int i = 0; i < cars.length; i++)
        {
           Runnable turnGreen = () -> System.out.print(" Turning to green");
           Runnable carCross  = () -> System.out.print(" Crossing Car");

           final int carId = cars[i];
           final int roadId = roadIds[i];
           final int direction = directions[i];
           threads[i] = new Thread(() -> trafficLight.carArrived(carId,
                                                                roadId,
                                                               direction,
                                                               turnGreen,
                                                               carCross));

           threads[i].start();

        }

        for(Thread t:threads)
        {
           try
           {
             t.join();
           }catch(InterruptedException e)
           {
              e.printStackTrace();
           }
        }

    }*/

    public static void main(String[] args)
    {
        System.out.println("Hello Traffic Light");

        int[] cars = {1,2,3,4,5};
        int[] directions = {3,4,3,2,1};
        int[] roadIds = {2,2,2,1,1};

        TrafficLight trafficLight = new TrafficLight();

        Thread[] threads = new Thread[cars.length];

        for(int i = 0; i < cars.length; i++)
        {
           Runnable turnGreen = () -> System.out.print(" Turning to green");
           Runnable carCross  = () -> System.out.print(" Crossing Car");

           final int carId = cars[i];
           final int roadId = roadIds[i];
           final int direction = directions[i];
           threads[i] = new Thread(() -> trafficLight.carArrived(carId,
                                                                roadId,
                                                               direction,
                                                               turnGreen,
                                                               carCross));


           threads[i].start();

        }

        for(Thread t:threads)
        {
           try
           {
             t.join();
           }catch(InterruptedException e)
           {
              e.printStackTrace();
           }
        }

    }

}
