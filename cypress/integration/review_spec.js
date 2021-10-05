describe('check cottages', () => {
    it('check cozy cottage vrbo reviews', () => {
        cy.visit('https://www.vrbo.com/2111572');
        cy.contains('7 Reviews');
    })

    it('check haven hideaway vrbo reviews', () => {
        cy.visit('https://www.vrbo.com/2111556');
        cy.contains('6 Reviews');
    })
})
