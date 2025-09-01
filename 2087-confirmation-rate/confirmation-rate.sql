# Write your MySQL query statement below
Select s.user_id, ifnull(round(sum(action='confirmed')/count(s.user_id),2),0) as confirmation_rate
From Signups s 
Left Join Confirmations c
on s.user_id = c.user_id
group by s.user_id
