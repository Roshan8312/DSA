class Solution {

    public int[] closestDivisors(int num) {

        int[] answer = new int[2];
        int minDiff = Integer.MAX_VALUE;

        for (int x = num + 1; x <= num + 2; x++) {

            int sqrt = (int) Math.sqrt(x);

            for (int i = sqrt; i >= 1; i--) {

                if (x % i == 0) {

                    int a = i;
                    int b = x / i;

                    int diff = b - a;

                    if (diff < minDiff) {
                        minDiff = diff;
                        answer[0] = a;
                        answer[1] = b;
                    }

                    break;
                }
            }
        }

        return answer;
    }
}