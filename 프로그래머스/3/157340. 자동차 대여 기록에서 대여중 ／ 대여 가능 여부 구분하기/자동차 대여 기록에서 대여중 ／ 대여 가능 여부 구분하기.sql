-- 코드를 입력하세요
SELECT CAR_ID, max(case when '2022-10-16' BETWEEN START_DATE AND END_DATE then '대여중' else '대여 가능' end) as AVAILABILITY 
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
GROUP BY CAR_ID
ORDER BY CAR_ID DESC;