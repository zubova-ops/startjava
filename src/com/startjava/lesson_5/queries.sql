--echo Вывод таблицы
SELECT * FROM jaegers;

--echo Вывод только неуничтоженных роботов
SELECT * FROM jaegers WHERE status = 'Active';

--echo Вывод только роботов серии Mark-1 и Mark-4
SELECT * FROM jaegers WHERE mark IN(1,4) ;

--echo Вывод  всех роботов, кроме Mark-1 и Mark-4,
-- отсортировав таблицу по убыванию по столбцу mark
SELECT * FROM jaegers WHERE mark NOT IN(1,4)
ORDER BY mark DESC;

--echo-all информация о самых старых роботах
SELECT * FROM jaegers ORDER BY weight DESC;

--echo Вывод информации из столбцов model_name, mark, launch, kaiju_kill
-- тех роботов, которые уничтожили больше всех kaiju
SELECT model_name, mark, launch, kaiju_kill FROM jaegers
ORDER BY kaiju_kill DESC;

--echo средний вес роботов, округлив его до трех знаков после запятой.
SELECT ROUND(AVG(weight), 3) as avg_weight FROM jaegers;

--echo увеличение  на единицу количество уничтоженных
-- kaiju у неразрушенных роботов, отображение таблицы
UPDATE jaegers SET kaiju_kill = kaiju_kill + 1
WHERE status = 'Active';
SELECT * FROM jaegers;

--echo удаление уничтоженных роботов, отображение оставшихся
DELETE FROM jaegers
WHERE status = 'Destroyed';
SELECT * FROM jaegers;


