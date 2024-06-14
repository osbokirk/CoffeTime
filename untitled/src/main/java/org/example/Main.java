package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        page 1
          add recipe /name ingredients and instructions * using list
          view recipe / view all recipes and there details
          delete recipe /allow deletion by name
         */
        List recipes = new ArrayList<String>();
        Scanner userInput = new Scanner(System.in);

        System.out.println("""
                Hello Would You Like To 
                1) Add A Recipe \n
                2) View Existing Recipes \n
                3) Delete Existing Recipes \n""");

        switch (userInput.next()){
            case "1":
                //add a recipe

                break;
            case "2":
                //view Existing Recipes
                for(Object recipe:recipes){
                    //recipe.split(%);
                }
                break;
            case "3":
                // delete Existing Recipes
                break;
            default:
                System.out.println("No Valid Input");
        }



    }

}