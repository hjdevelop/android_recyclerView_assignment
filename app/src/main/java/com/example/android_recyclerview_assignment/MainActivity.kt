package com.example.android_recyclerview_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_recyclerview_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList = mutableListOf<People>()

        dataList.add(People(R.drawable.sample1, "리오넬 메시", "010-1111-1111", 1))
        dataList.add(People(R.drawable.sample2, "크리스티아누 호날두", "010-2222-2222", 0))
        dataList.add(People(R.drawable.sample3, "네이마르", "010-3333-3333", 1))
        dataList.add(People(R.drawable.sample4, "킬리안 음바페", "010-4444-4444", 0))
        dataList.add(People(R.drawable.sample5, "엘링 홀란", "010-5555-5555", 1))
        dataList.add(People(R.drawable.sample6, "마커스 래시포드", "010-6666-6666", 0))
        dataList.add(People(R.drawable.sample7, "라우타로 마르티네스", "010-7777-7777", 0))
        dataList.add(People(R.drawable.sample8, "로베르트 레반도프스키", "010-8888-8888", 1))
        dataList.add(People(R.drawable.sample9, "카림 벤제마", "010-9999-9999", 1))
        dataList.add(People(R.drawable.sample10, "해리 케인", "010-0000-0000", 0))

        binding.recyclerView.adapter = MyAdapter(dataList)

        val adapter = MyAdapter(dataList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}