-- 코드를 입력하세요
SELECT I.INGREDIENT_TYPE , SUM(F.TOTAL_ORDER) TOTAL_ORDER
FROM FIRST_HALF F INNER JOIN ICECREAM_INFO I ON F.FLAVOR = I.FLAVOR
GROUP BY I.INGREDIENT_TYPE
ORDER BY SUM(F.TOTAL_ORDER) ASC;