/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author 073kolesnikovyua
 */
public class HasZeroNeighbor {
 public boolean hasZeroNeighbor(int[] nums) {
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 0 && nums[i + 1] == 0) {
      return true;
    }
  }
  return false;
}   
}
