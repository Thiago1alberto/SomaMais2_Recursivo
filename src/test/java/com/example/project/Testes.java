package com.example.project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Testes {

   @Test
   public void test01(){
      int[] numeros = {3,3};
		int target = 6;
      Solucao s = new Solucao();

		int[] actual = s.somaDois(numeros, target);
      int[] expected = {3, 3};

      assertArrayEquals(expected, actual);
   }

   @Test
   public void test02(){
      int[] numeros = {2,7,11,15};
		int target = 9;
      Solucao s = new Solucao();

		int[] actual = s.somaDois(numeros, target);
      int[] expected = {2, 7};

      assertArrayEquals(expected, actual);
   }

   @Test
   public void test03(){
      int[] numeros = {0};
		int target = 1;
      Solucao s = new Solucao();

		int[] actual = s.somaDois(numeros, target);
      int[] expected = {-1, -1};

      assertArrayEquals(expected, actual);
   }
}
