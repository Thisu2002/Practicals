object CaesarCipher {
  def encrypt(initialText: String, shift: Int): String = {
    initialText.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decrypt(cipherText: String, shift: Int): String = {
    cipherText.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base - shift + 26) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def cipher(text: String, shift: Int, algorithm: (String, Int) => String): String = {
    algorithm(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val initialText = "Hello, World!"
    val shift = 4

    val encryptedText = cipher(initialText, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }
}
