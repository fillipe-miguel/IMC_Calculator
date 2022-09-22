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

        buttonCalculate.setOnClickListener {

            val height = binding.etHeight.text.toString()
            val weight = binding.etWeight.text.toString()

            if (height.isNotEmpty() && weight.isNotEmpty()) {
                val imc = (weight.toFloat() / (height.toFloat() * height.toFloat()))
                println(imc)

                when (binding.rbSexGroup.checkedRadioButtonId) {
                    R.id.rbMasculine -> {
                        if (imc < 20.7) {
                            Toast.makeText(baseContext, getString(R.string.txtA), Toast.LENGTH_LONG)
                                .show()
                        } else if (imc < 26.4) {
                            Toast.makeText(
                                baseContext,
                                getString(R.string.txtB),
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (imc < 27.8) {
                            Toast.makeText(
                                baseContext,
                                getString(R.string.txtC),
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (imc < 32.2) {
                            Toast.makeText(
                                baseContext,
                                getString(R.string.txtD),
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            Toast.makeText(
                                baseContext,
                                getString(R.string.txtE),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                    R.id.rbFeminine -> {
                        if (imc < 19.1) {
                            Toast.makeText(
                                baseContext,
                                getString(R.string.txtA),
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (imc < 25.8) {
                            Toast.makeText(
                                baseContext,
                                getString(R.string.txtB),
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (imc < 27.3) {
                            Toast.makeText(
                                baseContext,
                                getString(R.string.txtC),
                                Toast.LENGTH_SHORT
                            ).show()
                        } else if (imc < 31.1) {
                            Toast.makeText(
                                baseContext,
                                getString(R.string.txtD),
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            Toast.makeText(
                                baseContext,
                                getString(R.string.txtE),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            } else {
                Toast.makeText(baseContext, getString(R.string.txtWriteAll), Toast.LENGTH_SHORT)
                    .show()
            }


        }
    }
}