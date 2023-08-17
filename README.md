# **Selenide #1 & Selenide 2**

✅ Разработайте следующий автотест:
 - Откройте страницу Selenide в Github
 - Перейдите в раздел Wiki проекта
 - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
 - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

✅ На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
Убедитесь что загрузилась нужная страница (например^ что заголовок - "Build like the best.")

✅ (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()
 - Откройте https://the-internet.herokuapp.com/drag_and_drop
 - Перенесите прямоугольник А на место В
 - Проверьте, что прямоугольники действительно поменялись
 - В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()
