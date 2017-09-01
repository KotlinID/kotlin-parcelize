package id.kotlin.training.parcelize

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = title

        btnSubmit.setOnClickListener { submit() }
    }

    private fun submit() {
        val id = etUserId.text.toString()
        val name = etUserName.text.toString()
        val age = etUserAge.text.toString()

        if (id.isNotEmpty() && name.isNotEmpty() && age.isNotEmpty()) {
            val ids = id.toInt()
            val ages = age.toInt()

            if (ids != 0 && ages != 0) {
                val user = User(ids, name, ages)
                startActivity<DetailActivity>("USER" to user)
            } else {
                toast("Your data is empty!\n ID: $id, Name: $name, Age: $age")
            }
        } else {
            toast("Your data is empty!\n ID: $id, Name: $name, Age: $age")
        }
    }
}