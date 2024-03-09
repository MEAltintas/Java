
import java.util.*;

public class agac {

    static class Node {

        int deger;
        Node right;
        Node left;

        Node(int deger) {
            this.deger = deger;
            this.right = null;
            this.left = null;

        }
    }

    static void ekleme(Node node, int deger) {
        if (deger < node.deger) {
            if (node.left != null) {
                ekleme(node.left, deger);
            } else {
                node.left = new Node(deger);
            }

        } else if (deger > node.deger) {
            if (node.right != null) {
                ekleme(node.right, deger);

            } else {
                node.right = new Node(deger);
            }
        }

    }

    static void Inorder(Node node) {
        if (node != null) {
            Inorder(node.left);
            System.out.println(node.deger);
            Inorder(node.right);

        }
    }

    static void Preorder(Node node) {
        if (node != null) {
            System.out.println(node.deger);
            Preorder(node.left);
            Preorder(node.right);

        }
    }

    static void Postorder(Node node) {
        if (node != null) {
            Postorder(node.left);
            Postorder(node.right);
            System.out.println(node.deger);

        }
    }

    public static void main(String[] args) {
        agac agac = new agac();
        Node kok = new Node(71);
        System.out.println(kok.deger);
        agac.ekleme(kok, 3);
        agac.ekleme(kok, 86);
        agac.ekleme(kok, 5);
        agac.ekleme(kok, 36);
        agac.ekleme(kok, 68);
        System.out.println("Inorder: ");
        agac.Inorder(kok);
        System.out.println();
        System.out.println("Preorder: ");
        agac.Preorder(kok);
        System.out.println();
        System.out.println("Postorder: ");
        agac.Postorder(kok);

    }
}
