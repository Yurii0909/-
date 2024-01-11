/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author 073kolesnikovyua
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
  System.out.println("Введите длину массива: ");
    int length = scanner.nextInt();
    
    int[] nums = new int[length];
    
    System.out.println("Введите элементы массива: ");
    for (int i = 0; i < length; i++) {
        nums[i] = scanner.nextInt();
    }
    
    CountEvens countEvens = new CountEvens();
    System.out.println("Количество четных элементов: " + countEvens.countEvents(nums));
    
    MaxMinDiff maxMinDiff = new MaxMinDiff();
    System.out.println("Разница между максимальным и минимальным значением: " + maxMinDiff.maxMinDiff(nums));
    
    HasZeroNeighbor hasZeroNeighbor = new HasZeroNeighbor();
    System.out.println("В массиве есть два соседних элемента, с нулевым значением: " + hasZeroNeighbor.hasZeroNeighbor(nums));
    
}
}