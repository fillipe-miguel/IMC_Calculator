package br.com.example.imc_calculator

class Imc(private var weight: Float, private var height: Float) {
    private var resultOfImc = weight / (height * height)


    fun writeMasculine(): String {
        return if (resultOfImc < 20.7) "Abaixo do peso"
        else if (resultOfImc < 26.4) "No peso normal"
        else if (resultOfImc < 27.8) "Marginalmente acima do peso"
        else if (resultOfImc < 32.2) "Acima do peso ideal"
        else "Obeso"
    }

    fun writeFeminine(): String {
        return if (resultOfImc < 19.1) "Abaixo do peso"
        else if (resultOfImc < 25.8) "No peso normal"
        else if (resultOfImc < 27.3) "Marginalmente acima do peso"
        else if (resultOfImc < 31.1) "Acima do peso ideal"
        else "Obesa"
    }
}

//
//if (result < 20.7) writeToast(getString(R.string.txtA))
//else if (result < 26.4) writeToast(getString(R.string.txtB))
//else if (result < 27.8) writeToast(getString(R.string.txtC))
//else if (result < 32.2) writeToast(getString(R.string.txtD))
//else writeToast(getString(R.string.txtE))

//
//
//if (result < 19.1) writeToast(getString(R.string.txtA))
//else if (result < 25.8) writeToast(getString(R.string.txtB))
//else if (result < 27.3) writeToast(getString(R.string.txtC))
//else if (result < 31.1) writeToast(getString(R.string.txtD))
//else writeToast(getString(R.string.txtE))