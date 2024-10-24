class Heapsort:
    def __init__(self, array):
        self.arr = array

    def heapsort(self):
        n = len(self.arr) - 1
        parent = (n - 1) // 2

        # Construir o max-heap
        for i in range(parent, -1, -1):
            self.heapify(n, i)

        # Ordenar o array
        for i in range(n, 0, -1):
            self.swap(0, i)  
            self.heapify(i, 0)  

    def heapify(self, n, index):
        aux = index
        left = 2 * index + 1
        right = 2 * index + 2

        # Verifica se o filho da esquerda é maior que o nó atual
        if left < n and self.arr[left] > self.arr[aux]:
            aux = left

        # Verifica se o filho da direita é maior que o nó atual
        if right < n and self.arr[right] > self.arr[aux]:
            aux = right

        # Se o maior valor não é o nó atual, realiza a troca e continua
        if aux != index:
            self.swap(index, aux)
            self.heapify(n, aux)

    def show(self):
        for i in range(len(self.arr)):
            print(self.arr[i], end=" - ")
        print("")

    def swap(self, i, j):
        self.arr[i], self.arr[j] = self.arr[j], self.arr[i]

# Exemplo de uso:
arr = [12, 11, 13, 5, 6, 7]
hs = Heapsort(arr)
hs.heapsort()
hs.show()
