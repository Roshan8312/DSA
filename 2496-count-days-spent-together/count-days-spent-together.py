class Solution:
  def countDaysTogether(
      self,
      arriveAlice: str,
      leaveAlice: str,
      arriveBob: str,
      leaveBob: str,
  ) -> int:
    days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    def day_of_year(date_str: str) -> int:
      month, day = map(int, date_str.split('-'))
      return sum(days_in_month[: month - 1]) + day

    start_alice = day_of_year(arriveAlice)
    end_alice = day_of_year(leaveAlice)
    start_bob = day_of_year(arriveBob)
    end_bob = day_of_year(leaveBob)

    start_overlap = max(start_alice, start_bob)
    end_overlap = min(end_alice, end_bob)

    return max(0, end_overlap - start_overlap + 1)
