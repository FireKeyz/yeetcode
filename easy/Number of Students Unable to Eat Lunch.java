class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i = 0;
        int j = 0;
        int size = students.length;
        int n = size;
        int mismatches = 0;
        while(mismatches < n && n > 0) {
            if(students[i] != -1 && students[i] == sandwiches[j]) {
                students[i] = -1;
                j = j + 1;
                mismatches = 0;
                n--;
            } else if(students[i] != -1){
                mismatches++;
            }
            i = (i + 1)%size;
        }
       return mismatches;
    }
}