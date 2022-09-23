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

        fun writeResponse(text: String) {
            binding.tvResponse.text = text
        }

        buttonCalculate.setOnClickListener {

            val height = binding.etHeight.text.toString()
            val weight = binding.etWeight.text.toString()

            if (height.isNotEmpty() && weight.isNotEmpty()) {
                val imc = Imc(weight.toFloat(), height.toFloat())

                when (binding.rbSexGroup.checkedRadioButtonId) {
                    R.id.rbMasculine -> writeResponse(imc.writeMasculine())
                    R.id.rbFeminine -> writeResponse(imc.writeFeminine())
                }

            } else writeResponse(getString(R.string.txtWriteAll))
        }
    }
}