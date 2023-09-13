package com.raynaldgitaz.resturantt.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.raynaldgitaz.resturantt.ui.theme.pages.about.AboutScreen
import com.raynaldgitaz.resturantt.ui.theme.pages.foodview.AddFoodScreen
import com.raynaldgitaz.resturantt.ui.theme.pages.foodview.UpdateFoodScreen
import com.raynaldgitaz.resturantt.ui.theme.pages.foodview.ViewFoodScreen
import com.raynaldgitaz.resturantt.ui.theme.pages.foodview.ViewUploadsScreen
import com.raynaldgitaz.resturantt.ui.theme.pages.home.HomeScreen
import com.raynaldgitaz.resturantt.ui.theme.pages.interiorhomescreen.InteriorHomeScreen
import com.raynaldgitaz.resturantt.ui.theme.pages.login.LoginScreen
import com.raynaldgitaz.resturantt.ui.theme.pages.signup.SignupScreen
import com.raynaldgitaz.resturantt.ui.theme.pages.splash.Splash

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String = ROUTE_HOME) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_INTERIOR_HOMESCREEN){
            InteriorHomeScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUTE_ADD_FOOD) {
            AddFoodScreen(navController)
        }
        composable(ROUTE_VIEW_FOOD) {
            ViewFoodScreen(navController)
        }
        composable("$ROUTE_UPDATE_FOOD/{id}") { passedData ->
            UpdateFoodScreen(navController, passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOADS){
            ViewUploadsScreen(navController)
        }
        composable(SPLASH){
            Splash(navController)
        }
    }

}