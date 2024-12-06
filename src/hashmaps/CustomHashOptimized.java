package hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomHashOptimized<K, V> {

    // using linked list to optimize, using chaining here
    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entity[] entities;


    ArrayList<LinkedList<Entity>> list;

    private int size = 0;

    private float loadFactor = 0.5f; // inserted item / total size of array, if array reaches 50 item, double the size

    public CustomHashOptimized() {
        list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        // check size before adding new entity
        if ((float)(size) / list.size() > loadFactor) {
            reHash();
        }

        entities.add(new Entity(key, value));

        size++;
    }

    private void reHash() {
        System.out.println("We are now re-hashing!");

        ArrayList<LinkedList<Entity>> oldList = list;
        list = new ArrayList<>();

        size = 0;

        for (int i = 0; i < oldList.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entries : oldList) {
            for (Entity entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity != null && entity.key.equals(key)) {
                return entity.value;
            }
        }

        return null;
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);
        Entity target = null;
        for (Entity entity : entities) {
            if (entity != null && entity.key.equals(key)) {
                target = entity;
                break;
            }
        }

        entities.remove(target);
        size--;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Override to make the output prettier
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (LinkedList<Entity> entities : list) {
            for (Entity entry : entities) {
                builder.append(entry.key);
                builder.append(": ");
                builder.append(entry.value);
                builder.append(", ");
            }
        }
        builder.append("}");

        return builder.toString();
    }

}
