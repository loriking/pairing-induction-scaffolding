const sum = require('./myFile')

describe('My first test', () => {

  it('sums 2 numbers', () => {
    expect(sum(2,3)).toBe(5)
  })

})
