package br.com.samiac.problems.leetcode;

public class CalculateDelayedArrivalTime {
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
