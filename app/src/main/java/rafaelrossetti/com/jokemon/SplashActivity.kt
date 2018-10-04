package rafaelrossetti.com.jokemon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.animation.AnimationUtils

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    private fun carregar() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.animacao_splash)
        anim.reset()

        Handler().postDelayed({
            // Após o tempo definido irá executar a próxima tela
            val intent = Intent(this@SplashActivity,
                    MenuActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
            startActivity(intent)
            this@SplashActivity.finish()
        }, 3500L)
    }
}
