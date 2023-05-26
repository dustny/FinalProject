FINAL PROJECT AUTOMATION TEST WEB UI dan API TEST

Test API dan UI terdapat dalam satu repository, test cases menggunakan gerhin format dan cucumber sebagai library implementasi. folder terpisah untuk setiap step definition maupun features dalam masing" API maupun UI.
Report cucumber untuk HTML dan JSON Format, dan github action workflow untuk menjalankan test setiap terdapat pull request ataupun manual

Repository yang digunakan
TestImplementation junit 5.8.1
TestRunTimeOnly junit 5.8.1
TestImplementation github bonigarcia webdrivermanager 5.3.2
TestImplementation seleniumhq selenium java 4.9.1
TestImplementation cucumber java 7.11.1
TestImplementation cucumber junit 7.11.1
TestImplementation rest-assured 5.3.0
Implementation json version 20230227
TestImplementation json schema validator 5.3.0
TestImplementation testng 7.7.1

Untuk Test WebUI menggunakan website www.demoblaze.com sedangkan untuk testAPI menggunakan website https://dummyapi.io/data/v1. 
Cara menjalankan testnya dengan di terminal ketik ./gradlew cucumber_api -Ptags="@api" untuk api
dan ./gradlew cucumber_web -Ptags="@web"
