package br.com.example.imc_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.example.imc_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonCalculate = binding.btCalculate

        fun writeToast(text: String) {
            Toast.makeText(baseContext, text, Toast.LENGTH_LONG).show()
        }

        buttonCalculate.setOnClickListener {

            val height = binding.etHeight.text.toString()
            val weight = binding.etWeight.text.toString()

            if (height.isNotEmpty() && weight.isNotEmpty()) {

                val result = (weight.toFloat() / (height.toFloat() * height.toFloat()))

                when (binding.rbSexGroup.checkedRadioButtonId) {

                    R.id.rbMasculine -> {
                        if (result < 20.7) writeToast(getString(R.string.txtA))
                        else if (result < 26.4) writeToast(getString(R.string.txtB))
                        else if (result < 27.8) writeToast(getString(R.string.txtC))
                        else if (result < 32.2) writeToast(getString(R.string.txtD))
                        else writeToast(getString(R.string.txtE))

                    }

                    R.id.rbFeminine -> {
                        if (result < 19.1) writeToast(getString(R.string.txtA))
                        else if (result < 25.8) writeToast(getString(R.string.txtB))
                        else if (result < 27.3) writeToast(getString(R.string.txtC))
                        else if (result < 31.1) writeToast(getString(R.string.txtD))
                        else writeToast(getString(R.string.txtE))
                    }
                }
            } else writeToast(getString(R.string.txtWriteAll))
        }
    }
}