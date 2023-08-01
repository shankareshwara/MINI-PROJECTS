package Recipe;

import java.sql.SQLException;
import java.util.List;

public interface RecipeManagerInterface {

	 public void addRecipe(Recipe recipe) throws SQLException;
	 public List<Recipe> getAllRecipes() throws SQLException;
	 public List<Recipe> searchRecipes(String ingredient) throws SQLException ;
	List<Recipe> searchRecipes(String name, int id) throws SQLException;
	void deleteRecipes(String name) throws SQLException;
	void updateingredient(String name , String ingredient) throws SQLException;
	void updateinstruction(String name , String instruction) throws SQLException;
	
}

