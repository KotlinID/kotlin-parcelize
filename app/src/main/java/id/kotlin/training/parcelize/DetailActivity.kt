package id.kotlin.training.parcelize

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = title
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        load(this)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> onBackPressed()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun load(context: Context) {
        val user = intent.getParcelableExtra<User>("USER")
        val textId = context.resources.getString(R.string.text_id)
        val textName = context.resources.getString(R.string.text_name)
        val textAge = context.resources.getString(R.string.text_age)

        tvUserId.text = textId.format(user.id)
        tvUserName.text = textName.format(user.name)
        tvUserAge.text = textAge.format(user.age)
    }
}