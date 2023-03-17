package com.example.mycalci

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mycalci.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cal0.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"0"
        }
        binding.cal1.setOnClickListener{
            val p=binding.calExp.text.toString()
            binding.calExp.text=p+"1"
        }
        binding.cal2.setOnClickListener{
            val p=binding.calExp.text.toString()
            binding.calExp.text=p+"2"
        }
        binding.cal3.setOnClickListener{
            val p=binding.calExp.text.toString()
            binding.calExp.text=p+"3"
        }
        binding.cal4.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"4"
        }
        binding.cal5.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"5"
        }
        binding.cal6.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"6"
        }
        binding.cal7.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"7"
        }
        binding.cal8.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"8"
        }
        binding.cal9.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"9"
        }
        binding.calAdd.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"+"
        }
        binding.calSub.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"-"
        }
        binding.calMul.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"*"
        }
        binding.calDiv.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"/"
        }
        binding.calDot.setOnClickListener{
            val p=binding.calExp.text.toString();
            binding.calExp.text=p+"."
        }
        binding.calDel.setOnClickListener{
            val text = binding.calDel.text.toString()
            if(text.isNotEmpty()) {
                binding.calExp.text= text.drop(1)
            }else
            binding.calExp.text = ""
        }
        binding.calAC.setOnClickListener{

            binding.calExp.text=""

            binding.calRes.text=""
        }
        binding.calEq.setOnClickListener{
            val text = binding.calExp.text.toString()
            val expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                binding.calRes.text = longResult.toString()
                binding.calExp.text=binding.calRes.text
            } else {
                binding.calExp.text=binding.calRes.text
            }
        }

    }
    fun evaluate(){

    }
}