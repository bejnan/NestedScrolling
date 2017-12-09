package banaszewski.jakub.nestedscrolling

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }

    class Adapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        }

        override fun getItemCount(): Int = 3

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
            return ViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.test, parent, false))
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recView = findViewById<RecyclerView>(R.id.nest2)
        recView.layoutManager = LinearLayoutManager(this)
        recView.adapter = Adapter()
    }
}