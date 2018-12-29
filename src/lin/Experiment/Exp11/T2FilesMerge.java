package lin.Experiment.Exp11;

/**
 * 编写一个文本文件合并程序，要求如下：
 * (1)在D盘根目录上新建一个file目录, 然后在该目录下建R（R是2-8中的一个随机整数）个文本文件（比如，若R=4，就建4个文件），文件名分别为你的学号+字母序号.txt,（假设学号是201611001，第一个文本文件就是201611001A.txt,第二个文件就是201611001B.txt，依次类推）。
 * 然后在第一个文件中随机写入40个整数（0-100中的数），每5个一行
 * 第二个文件中随机写入40个整数（0-100中的数），每5个一行
 * 第三个文件中随机写入40个整数（0-100中的数），每5个一行
 * 依次类推。
 *
 * （2）再编写一个合并文件程序
 * 然后将D盘file目录下的这些文本文件合并成一个新的文本文件,文件名为你的学号.txt。
 * 合并规则
 * 先随机生成一个随机整数x(40-60之间的整数)，从第一个文件开始，将这些文件中大于x的数输出到新的文件中，且每10个数为一行。
 * 最后在屏幕上显示合并后文件的内容。
 *
 * 由于类似的题目我在之前已经做过了，所以不再重复。
 * 前面的代码见：da.Experiment.Exp11.extra3
 */
public class T2FilesMerge {

}