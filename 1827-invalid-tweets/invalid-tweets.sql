# Write your MySQL query statement below
select tweet_id 
from Tweets
where char_length(content)>15; #don't use length
