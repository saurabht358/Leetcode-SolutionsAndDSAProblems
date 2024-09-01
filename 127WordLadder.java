public int ladderLength(String beginWord, String endWord, List<String> wordList2) {
        if (!wordList2.contains(endWord))
            return 0;

        Set<String> visited = new HashSet<>();
        Set<String> wordList=new HashSet<>(wordList2);
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int length = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            length++;

            for (int i = 0; i < size; i++) {
                String current = q.poll();

                for (int j = 0; j < current.length(); j++) {
                    char[] temp = current.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        temp[j] = c;
                        String newWord = new String(temp);

                        if (newWord.equals(endWord))
                            return length + 1;

                        if (wordList.contains(newWord) && !visited.contains(newWord)) {
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }

        return 0;
    
    }
