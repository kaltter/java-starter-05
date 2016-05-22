package hw.hw04.hw41;

/*/*Создайте класс AbstractHandler.
В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
Написать программу, которая будет выполнять определение документа и для каждого формата должны быть методы открытия,
создания, редактирования, сохранения определенного формата документа.
*/
public abstract class AbstractHandler {
    abstract void open();

    abstract void create();

    abstract void change();

    abstract void save();

    class XMLHandler extends AbstractHandler {
        @Override
        void open() {
        }

        @Override
        void create() {
        }

        @Override
        void change() {
        }

        @Override
        void save() {
        }
    }

    class TXTHandler extends AbstractHandler {
        @Override
        void open() {
        }

        @Override
        void create() {
        }

        @Override
        void change() {
        }

        @Override
        void save() {
        }
    }

    class DOCGandler extends AbstractHandler {
        @Override
        void open() {
        }

        @Override
        void create() {
        }

        @Override
        void change() {
        }

        @Override
        void save() {
        }

    }


}
