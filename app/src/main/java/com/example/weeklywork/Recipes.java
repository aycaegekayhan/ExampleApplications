package com.example.weeklywork;

public class Recipes {

    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int ThumbNail;

    public Recipes(String name, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbNail) {
        RecipeName = name;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        ThumbNail = thumbNail;
    }

    public String getRecipeName() {
        return RecipeName;
    }

    public String getRecipeIngredients() {
        return RecipeIngredients;
    }

    public String getRecipeMethodTitle() {
        return RecipeMethodTitle;
    }

    public String getRecipe() {
        return Recipe;
    }

    public int getThumbNail() {
        return ThumbNail;
    }
}
