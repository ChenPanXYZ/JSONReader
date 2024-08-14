# Activity: Reading from and Writing to JSON in Java

JSON (JavaScript Object Notation) is a language-independent data format, which many programming languages support, including Java and Python. Although Java doesn't support JSON natively, there are libraries that add this compatibility to Java. We will be using https://mvnrepository.com/artifact/org.json/json.

JSON follows a certain syntax. For simplicity, you can use Python's double quotation syntax for dictionaries and lists. For more information, you can visit the JSON's official website at: https://www.json.org/json-en.html. Below is an example of a valid JSON, which represents a JSON array of length 1, whose element is a JSON object represents "Canada" in different languages.

```
[
      {
    "id": 124,
    "alpha2": "ca",
    "alpha3": "can",
    "ar": "كندا",
    "bg": "Канада",
    "cs": "Kanada",
    "da": "Canada",
    "de": "Kanada",
    "el": "Καναδάς",
    "en": "Canada",
    "eo": "Kanado",
    "es": "Canadá",
    "et": "Kanada",
    "eu": "Kanada",
    "fa": "کانادا",
    "fi": "Kanada",
    "fr": "Canada",
    "hr": "Kanada",
    "hu": "Kanada",
    "hy": "Կանադա",
    "it": "Canada",
    "ja": "カナダ",
    "ko": "캐나다",
    "lt": "Kanada",
    "nl": "Canada",
    "no": "Canada",
    "pl": "Kanada",
    "pt": "Canadá",
    "ro": "Canada",
    "ru": "Канада",
    "sk": "Kanada",
    "sl": "Kanada",
    "sr": "Kanada",
    "sv": "Kanada",
    "th": "แคนาดา",
    "uk": "Канада",
    "zh": "加拿大",
    "zh-tw": "加拿大"
  }
]
```

You may find this website helpful: https://jsonlint.com/, you can try to make a JSON and see if your JSON is valid or not!

In this exercise, you will be working with a JSON array (where the example JSON comes from), which represents a list of countries and the associated metadata. Each element of the JSON array is a JSON object.

## Reading from a JSON
The goal of this activity is for you to complete a function in `JSONReader` called `String  getCountryNameTranslation(String countryName, String language)`, which takes in a country's alpha2 code and an desired language, and output the country's name in that language. You will need to read from a JSON and return the right information only if the JSON object represents the country you are interested in.

`getCanadaCountryNameSpanishTranslation` gives your an example of reading from JSON. You can learn from this function, which translate "Canada" into Spanish.

Running `JSONReaderTest` will test your implementation.