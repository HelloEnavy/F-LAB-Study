public class LinkedListTest {

    public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable {
        transient int size = 0;

        /**
         * Pointer to first node.
         */
        transient Node<E> first;

        /**
         * Pointer to last node.
         */
        transient Node<E> last;

    }

    private static class Node<E> {
        //데이터 요소에 대한 정보
        E item;
        //다음으로 연결된 노드에 대한 정보
        Node<E> next;
        //이전 연결된 노드에 대한 정보
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
