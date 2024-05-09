package com.example.myapplication.presentation.nvgraph

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.myapplication.presentation.home.HomeScreen
import com.example.myapplication.presentation.home.HomeViewModel
import com.example.myapplication.presentation.onboarding.OnBoardingScreen
import com.example.myapplication.presentation.onboarding.componenets.OnBoardingViewModel


@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(route = Route.OnBoardingScreen.route) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(onEvent = viewModel::onEvent)
            }
        }

        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.HomeScreen.route
        ) {
            composable(route = Route.HomeScreen.route) {
                val viewModel:HomeViewModel= hiltViewModel()
                val articles=viewModel.news.collectAsLazyPagingItems()
                HomeScreen(articles = articles, navigate ={} )

            }
            composable(route = Route.SearchScreen.route) {

            }
            composable(route = Route.BookmarkScreen.route) {

            }
            composable(route = Route.DetailsScreen.route) {

            }
        }
    }
}