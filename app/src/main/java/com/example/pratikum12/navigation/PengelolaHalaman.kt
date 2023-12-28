import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.pratikum12.ui.ui.home.screen.DestinasiEntry
import com.example.pratikum12.ui.ui.home.screen.DestinasiHome
import com.example.pratikum12.ui.ui.home.screen.EntryKontakScreen
import com.example.pratikum12.ui.ui.home.screen.HomeScreen
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun PengelolaHalaman (navController: NavHostController = rememberNavController()){

    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier,
    ){
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiEntry.route)
                },
                onDetailClick = {
                }
            )
        }

        composable(DestinasiEntry.route){
            EntryKontakScreen(navigateBack = {
                navController.navigate(DestinasiHome.route){
                    popUpTo(DestinasiHome.route){
                        inclusive = true
                    }
                }
            })
        }
    }
}
