-- 코드를 입력하세요
SELECT ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE,ri.FAVORITES, ri.ADDRESS,round(avg(rr.REVIEW_SCORE),2) as SCORE
FROM REST_INFO ri inner join REST_REVIEW rr on ri.REST_ID = rr.REST_ID
WHERE ADDRESS LIKE '서울%'
GROUP BY ri.REST_NAME
ORDER BY avg(rr.REVIEW_SCORE) DESC, ri.FAVORITES DESC;